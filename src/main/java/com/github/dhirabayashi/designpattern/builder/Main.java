package com.github.dhirabayashi.designpattern.builder;

public class Main {
    public static void main(String[] args){
        if(args.length != 1){
            usage();
            System.exit(0);
        }

        switch (args[0]) {
            case "plain" -> {
                var textBuilder = new TextBuilder();
                var director = new Director(textBuilder);
                director.construct();
                var result = textBuilder.getResult();
                System.out.println(result);
            }
            case "html" -> {
                var htmlBuilder = new HTMLBuilder();
                var director = new Director(htmlBuilder);
                director.construct();
                var filename = htmlBuilder.getResult();
                System.out.println(filename + "が作成されました。");
            }
            case "json" -> {
                var jsonBuilder = new JSONBuilder();
                var director = new Director(jsonBuilder);
                director.construct();
                var result = jsonBuilder.getResult();
                System.out.println(result);
            }
            default -> usage();
        }
    }
    public static void usage(){
        System.out.println("Usage: java Main plain     プレーンテキストで文書作成");
        System.out.println("Usage: java Main html     htmlで文書作成");
        System.out.println("Usage: java Main json     JSONで文書作成");
    }
}
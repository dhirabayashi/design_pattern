package com.github.dhirabayashi.designpattern.builder;

public class Main {
    public static void main(String[] args){
        if(args.length != 1){
            usage();
            System.exit(0);
        }

        if(args[0].equals("plain")) {
            var textBuilder = new TextBuilder();
            var director = new Director(textBuilder);
            director.construct();
            var result = textBuilder.getResult();
            System.out.println(result);
        } else if(args[0].equals("html")) {
            var htmlBuilder = new HTMLBuilder();
            var director = new Director(htmlBuilder);
            director.construct();
            var filename = htmlBuilder.getResult();
            System.out.println(filename + "が作成されました。");
        } else {
            usage();
        }
    }
    public static void usage(){
        System.out.println("Usage: java Main plain     プレーンテキストで文書作成");
        System.out.println("Usage: java Main html     htmlで文書作成");
    }
}
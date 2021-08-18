package com.github.dhirabayashi.designpattern.chainofresponsibility;

public abstract class Support {
    private final String name;
    private Support next;

    protected Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        //if(resolve(trouble)) {
        //    done(trouble);
        //} else if(next != null) {
        //    next.support(trouble);
        //} else {
        //    fail(trouble);
        //}
        boolean resolved = false;
        Support lastSupport = null;
        for(var support = this; support != null; support = support.next) {
            lastSupport = support;
            if(support.resolve(trouble)) {
                support.done(trouble);
                resolved = true;
                break;
            }
        }
        if(!resolved) {
            lastSupport.fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}

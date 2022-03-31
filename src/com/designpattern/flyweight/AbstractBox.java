package com.designpattern.flyweight;

public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("" + this.getShape() + " \n颜色：" + color);
    }
}

class IBox extends AbstractBox {

    @Override
    public String getShape() {
        return "-----" +'\n'+
                "  I   " +'\n'+
                "  I   " +'\n'+
                "  I   " +'\n'+
                "-----";
    }
}

class LBox extends AbstractBox {

    @Override
    public String getShape() {
        return "   I " +'\n'+
                "  I   " +'\n'+
                "  I   " +'\n'+
                "  I   " +'\n'+
                "  -----";
    }
}

class OBox extends AbstractBox {

    @Override
    public String getShape() {
        return "   *** " +'\n'+
                " *    *" +'\n'+
                "*       *" +'\n'+
                " *    *" +'\n'+
                "  *** " +'\n';
    }
}
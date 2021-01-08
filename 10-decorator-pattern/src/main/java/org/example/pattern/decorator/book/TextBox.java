package org.example.pattern.decorator.book;

//文本框类：具体构件类
class TextBox extends Component {

    @Override
    public void display() {
        System.out.println("显示文本框！");
    }
}
package org.example.pattern.decorator.book;

//构件装饰类：抽象装饰类
class ComponentDecorator extends Component {
    //维持对抽象构件类型对象的引用
    private final Component component;

    //注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }

}
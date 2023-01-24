package electronics.control;

public abstract interface ButtonPress {   //нажатие кнопки
    default void click(){
        System.out.println("Кнопка нажата");
    };
}

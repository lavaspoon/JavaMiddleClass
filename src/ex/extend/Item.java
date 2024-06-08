package ex.extend;

public class Item {
    private String name;
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public Item(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println("이름 = " + this.name + ", 가격 = " + this.price);
    }
}

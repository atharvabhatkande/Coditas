package EnumsTutorial;

public enum Chocolate {
    CADBURY(20),
    KITKAT(40),
    MUNCH(60),
    PERK(80);

   final int superciliousness;

Chocolate(int superciliousness){
    this.superciliousness = superciliousness;
}
}
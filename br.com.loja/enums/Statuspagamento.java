package enums;

public enum Statuspagamento {
    PAGO("seu item foi pago"),
    PEDENTE("pagamento pedente"),
    CANCELADO("compra cancelada");

    private final String descricao;

    Statuspagamento(String descricao){
        this.descricao = descricao;
    }
    public  String getDescricao(){
        return descricao;
    }

    public static Statuspagamento  fromDescricao(String descricao){
        for (Statuspagamento c : values()){
            if(c.descricao.equalsIgnoreCase(descricao.trim())){
                return c;
            }
        }
        throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}
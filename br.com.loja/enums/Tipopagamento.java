package enums;

public enum Tipopagamento {
    CREDITO("Credito no cartão"),
    PIX("Pix"),
    DEBITO("Debito no cartão");

        private final String descricao;

    Tipopagamento(String descricao){
        this.descricao = descricao;
    }
    public  String getDescricao(){
        return descricao;
    }

    public static Tipopagamento fromDescricao(String descricao){
        for (Tipopagamento c : values()){
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

package b4hive;

public class OperacaoFactory {

    //region Singleton
    private static OperacaoFactory instance;
    private OperacaoFactory() {}
    public static OperacaoFactory getInstance() {
        if (instance == null) {
            instance = new OperacaoFactory();
        }
        return instance;
    }
    //endregion Singleton

    //region Factory Method
    public static Operacao getOperacao(String operacaoName) {
        Class<? extends Operacao> operacaoClass = null;
        try {
            operacaoClass = (Class<? extends Operacao>) Class.forName("b4hive." + operacaoName);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Operação não encontrada: " + operacaoName);
        }

        Object operacaoInstance = null;
        try {
            operacaoInstance = operacaoClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao instanciar a operação: " + operacaoName, e);
        }
        return (Operacao) operacaoInstance;
    }
    //endregion Factory Method

}

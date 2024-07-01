package ObserverPatternExample;

public class ConcreteObserver implements Observer {
    private String observerState;

    @Override
    public void update() {
        // Defina a lógica de atualização quando o estado do Observable mudar
        System.out.println("Observer atualizado com sucesso.");
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }
}

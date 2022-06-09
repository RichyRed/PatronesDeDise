package state.practica;

public class Apagado implements IStateCompu {


    @Override
    public void resourceManager(Compu computer) throws InterruptedException {
        System.out.println("--- Apagando -----");
        computer.getConsumoCPU().setCapacidadUtiliza(0);
        computer.getConsumoCPU().setCapacidadUtiliza(0);
        computer.getConsumoRAM().showInfo();
        computer.getConsumoCPU().showInfo();
        computer.getProgramasAbiertos().showInfo();
    }
}
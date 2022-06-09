package state.practica;

public class Reiniciar implements IStateCompu {


    @Override
    public void resourceManager(Compu computer) throws InterruptedException {
        System.out.println("----- Reiniciando ------");
        computer.getConsumoCPU().setCapacidadUtiliza(0);
        computer.getConsumoCPU().setCapacidadUtiliza(0);
        computer.getProgramasAbiertos().setProgramas("programas cerrados");
        computer.getConsumoRAM().showInfo();
        computer.getConsumoCPU().showInfo();
        computer.getProgramasAbiertos().showInfo();
    }
}

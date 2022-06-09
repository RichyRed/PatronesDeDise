package state.practica;

public class Compu {
    private IStateCompu stateComputadora;
    private Programas programasAbiertos;
    private ConsumoCPU consumoCPU;
    private ConsumoRAM consumoRAM;

    public Compu() {
        programasAbiertos=new Programas();
        consumoCPU=new ConsumoCPU();
        consumoRAM=new ConsumoRAM();
        programasAbiertos.setProgramas("Demasiadoa programas");
        consumoCPU.setCapacidadTotal("1g").setCapacidadUtiliza(5).setDescription("cpu");
        consumoRAM.setCapacidadTotal("16g").setCapacidadUtiliza(5).setDescription("rizen");
        stateComputadora=new Apagado();
    }

    public IStateCompu getStateComputadora() {
        return stateComputadora;
    }

    public void setStateComputadora(IStateCompu stateComputadora) {
        this.stateComputadora = stateComputadora;
    }

    public Programas getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(Programas programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public ConsumoCPU getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(ConsumoCPU consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    public ConsumoRAM getConsumoRAM() {
        return consumoRAM;
    }

    public void setConsumoRAM(ConsumoRAM consumoRAM) {
        this.consumoRAM = consumoRAM;
    }
    public void resourceManager() throws InterruptedException {
        stateComputadora.resourceManager(this);
    }
}

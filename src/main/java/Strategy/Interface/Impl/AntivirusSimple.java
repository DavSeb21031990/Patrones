package Strategy.Interface.Impl;

public class AntivirusSimple extends AnalisisSimple {

    @Override
    void detener() {
        System.out.println("Antivirus Simple - Análisis simple finalizado");
    }

    @Override
    void saltarZip() {
        try {
            System.out.println("Analizando...");
            Thread.sleep(2500);
            System.out.println("No se pudo analizar con extensión '.zip'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    void iniciar() {
        System.out.println("Antivirus Simple - Análisis simple iniciado");
    }

}

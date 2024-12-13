public class Profesor extends ComuidadEPN{
    private String materiasdictadas;
    private String facultad;
    private String tipocontrato;

    public Profesor(String cedula, String nombre, int edad, String direccion, String telefono, String correo, String materiasdictadas, String facultad, String tipocontrato) {
        super(cedula, nombre, edad, direccion, telefono, correo);
        this.materiasdictadas = materiasdictadas;
        this.facultad = facultad;
        this.tipocontrato = tipocontrato;
    }

    public Profesor() {
    }

    public String getMateriasdictadas() {
        return materiasdictadas;
    }

    public void setMateriasdictadas(String materiasdictadas) {
        this.materiasdictadas = materiasdictadas;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(String tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Materias Dictadas: " + this.materiasdictadas);
        System.out.println("Facultad: " + this.facultad);
        System.out.println("Tipo de Contrato: " + this.tipocontrato);
    }
}

package miprograma;
public class MiPrograma {
    public static void main(String[] args) {
        //instancear un objeto de la clase estudiante
        Estudiante est1 = new Estudiante();
        
        //set = almacenar el objeto
        //get = presentar el objeto
        est1.setNombre("Jose");
        est1.setApellido("Aroca");
        
        System.out.println(est1.getNombre() + " " + est1.getApellido());
        
        Estudiante est2 = new Estudiante();
        
        est2.setNombre("Rafael");
        est2.setApellido("Correa");
        
        System.out.println(est2.getNombre() + " " + est2.getApellido());
               
    }
    
}

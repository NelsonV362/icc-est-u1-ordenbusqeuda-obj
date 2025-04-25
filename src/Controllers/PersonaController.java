package Controllers;

import models.Persona;
public class PersonaController {
    public void sortByDireccionCodigo(Persona[]personas){
        for (int i=0; i<personas.length;i++){
            int iM= i+1;
            for(int j=i+1;j<personas.length;j++){
                if (personas[j].compareCodigoDireccion(personas[i])){
                    iM=j;
                }
            }
            if(i!= iM){
                Persona aux= personas[iM];
                personas[iM]=personas[i];
                personas[i]=aux;
            }
        }
    }

    public Persona findPersonasByCodigo(Persona[]personas, int codigo){
        int bajo=0, alto=personas.length-1;

        while(bajo <= alto){
            int center =(bajo+alto)/2;
            int comparacion = Integer.compare(personas[center].getCodigoDireccion(), codigo);

            if (personas[center].equalsByCodigoDireccion(codigo)){
                return  personas[center];
            }else if (comparacion < 0) {
                alto = center - 1;
            } else {
                bajo = center + 1;
            }
        }
        return null;
    }

    public Persona findPersonasByCodigoDireccion(Persona[] personas, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findPersonasByCodigoDireccion'");
    }

}
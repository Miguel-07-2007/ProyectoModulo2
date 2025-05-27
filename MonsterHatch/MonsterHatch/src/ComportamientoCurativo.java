public class ComportamientoCurativo implements EstrategiaBatalla {

    @Override
    public void actuar(Criatura criatura, Criatura enemigo) {
        int cura = 5 + (int)(Math.random()*5);
        criatura.aumentarVida(cura);
        System.out.println(criatura.getNombre() + " cura su vida aumentando su " +
        "vida en " + cura + " puntos, su vida actual es " + criatura.getVida());
    }

}

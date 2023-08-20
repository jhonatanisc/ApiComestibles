package com.dvej.ApiComestibles.models.Alimentos;

import jakarta.persistence.*;

@Entity
@Table(name="alimentos")
public class Alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;
    @Column(name = "cantidad_sugerida", nullable = false)
    private float cantidadSugerida;
    @ManyToOne(optional = false)
    private Unidad unidad;
    @ManyToOne(optional = false)
    private GrupoAlimenticio grupoAlimenticio;
    @Column(name = "peso_bruto", nullable = false)
    private float pesoBruto;
    @Column(name = "peso_neto", nullable = false)
    private float pesoNeto;
    @Column(name = "energia_kcal", nullable = false)
    private float energiaKcal;
    @Column(name = "energia_kJ", nullable = false)
    private float energiaKj;
    @Column(name = "proteina")
    private float proteina;
    @Column(name = "lipidos")
    private float lipidos;
    @Column(name = "hidratos_carbono")
    private float hidratosCarbono;
    @Column(name = "fibra")
    private float fibra;
    @Column(name = "acido_folico")
    private float acidoFolico;
    @Column(name = "calcio")
    private float calcio;
    @Column(name = "hierro")
    private float hierro;
    @Column(name = "sodio")
    private float sodio;
    @Column(name = "azucares")
    private float azucares;
    @Column(name = "vitamina_A")
    private float vitaminaA;
    @Column(name = "hierro_no_hem")
    private float hierroNOHEM;
    @Column(name = "fosforo")
    private float fosforo;
    @Column(name = "acido_ascorbico")
    private float acidoAscorbico;
    @Column(name = "potasio")
    private float potasio;
    @Column(name = "ag_mono")
    private float agMono;
    @Column(name = "ag_poli")
    private float agPoli;
    @Column(name = "ag_saturados")
    private float agSaturados;
    @Column(name = "selenio")
    private float selenio;
    @Column(name = "azucar")
    private float azucar;
    @Column(name = "indice_glucemico")
    private float indiceGlucemico;
    @Column(name = "carga_glucemica")
    private float cargaGlucemica;

    public Alimento() {
    }

    public Alimento(String nombre, float cantidadSugerida, Unidad unidad, GrupoAlimenticio grupoAlimenticio, float pesoBruto, float energiaKcal, float energiaKj, float proteina, float lipidos, float hidratosCarbono, float fibra, float acidoFolico, float calcio, float hierro, float sodio, float azucares, float vitaminaA, float hierroNOHEM, float fosforo, float acidoAscorbico, float potasio, float agMono, float agPoli, float agSaturados, float selenio, float azucar, float indiceGlucemico, float cargaGlucemica) {
        this.nombre = nombre;
        this.cantidadSugerida = cantidadSugerida;
        this.unidad = unidad;
        this.grupoAlimenticio = grupoAlimenticio;
        this.pesoBruto = pesoBruto;
        this.energiaKcal = energiaKcal;
        this.energiaKj = energiaKj;
        this.proteina = proteina;
        this.lipidos = lipidos;
        this.hidratosCarbono = hidratosCarbono;
        this.fibra = fibra;
        this.acidoFolico = acidoFolico;
        this.calcio = calcio;
        this.hierro = hierro;
        this.sodio = sodio;
        this.azucares = azucares;
        this.vitaminaA = vitaminaA;
        this.hierroNOHEM = hierroNOHEM;
        this.fosforo = fosforo;
        this.acidoAscorbico = acidoAscorbico;
        this.potasio = potasio;
        this.agMono = agMono;
        this.agPoli = agPoli;
        this.agSaturados = agSaturados;
        this.selenio = selenio;
        this.azucar = azucar;
        this.indiceGlucemico = indiceGlucemico;
        this.cargaGlucemica = cargaGlucemica;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidadSugerida() {
        return cantidadSugerida;
    }

    public void setCantidadSugerida(float cantidadSugerida) {
        this.cantidadSugerida = cantidadSugerida;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public float getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(float pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public float getEnergiaKcal() {
        return energiaKcal;
    }

    public void setEnergiaKcal(float energiaKcal) {
        this.energiaKcal = energiaKcal;
    }

    public float getEnergiaKj() {
        return energiaKj;
    }

    public void setEnergiaKj(float energiaKj) {
        this.energiaKj = energiaKj;
    }

    public float getProteina() {
        return proteina;
    }

    public void setProteina(float proteina) {
        this.proteina = proteina;
    }

    public float getLipidos() {
        return lipidos;
    }

    public void setLipidos(float lipidos) {
        this.lipidos = lipidos;
    }

    public float getHidratosCarbono() {
        return hidratosCarbono;
    }

    public void setHidratosCarbono(float hidratosCarbono) {
        this.hidratosCarbono = hidratosCarbono;
    }

    public float getFibra() {
        return fibra;
    }

    public void setFibra(float fibra) {
        this.fibra = fibra;
    }

    public float getAcidoFolico() {
        return acidoFolico;
    }

    public void setAcidoFolico(float acidoFolico) {
        this.acidoFolico = acidoFolico;
    }

    public float getCalcio() {
        return calcio;
    }

    public void setCalcio(float calcio) {
        this.calcio = calcio;
    }

    public float getHierro() {
        return hierro;
    }

    public void setHierro(float hierro) {
        this.hierro = hierro;
    }

    public float getSodio() {
        return sodio;
    }

    public void setSodio(float sodio) {
        this.sodio = sodio;
    }

    public float getAzucares() {
        return azucares;
    }

    public void setAzucares(float azucares) {
        this.azucares = azucares;
    }

    public float getAzucar() {
        return azucar;
    }

    public void setAzucar(float azucar) {
        this.azucar = azucar;
    }

    public float getIndiceGlucemico() {
        return indiceGlucemico;
    }

    public void setIndiceGlucemico(float indiceGlucemico) {
        this.indiceGlucemico = indiceGlucemico;
    }

    public float getCargaGlucemica() {
        return cargaGlucemica;
    }

    public void setCargaGlucemica(float cargaGlucemica) {
        this.cargaGlucemica = cargaGlucemica;
    }

    public GrupoAlimenticio getGrupoAlimenticio() {
        return grupoAlimenticio;
    }

    public void setGrupoAlimenticio(GrupoAlimenticio grupoAlimenticio) {
        this.grupoAlimenticio = grupoAlimenticio;
    }

    public float getPesoNeto() {
        return pesoNeto;
    }

    public void setPesoNeto(float pesoNeto) {
        this.pesoNeto = pesoNeto;
    }

    public float getVitaminaA() {
        return vitaminaA;
    }

    public void setVitaminaA(float vitaminaA) {
        this.vitaminaA = vitaminaA;
    }

    public float getHierroNOHEM() {
        return hierroNOHEM;
    }

    public void setHierroNOHEM(float hierroNOHEM) {
        this.hierroNOHEM = hierroNOHEM;
    }

    public float getFosforo() {
        return fosforo;
    }

    public void setFosforo(float fosforo) {
        this.fosforo = fosforo;
    }

    public float getAcidoAscorbico() {
        return acidoAscorbico;
    }

    public void setAcidoAscorbico(float acidoAscorbico) {
        this.acidoAscorbico = acidoAscorbico;
    }

    public float getPotasio() {
        return potasio;
    }

    public void setPotasio(float potasio) {
        this.potasio = potasio;
    }

    public float getAgMono() {
        return agMono;
    }

    public void setAgMono(float agMono) {
        this.agMono = agMono;
    }

    public float getAgPoli() {
        return agPoli;
    }

    public void setAgPoli(float agPoli) {
        this.agPoli = agPoli;
    }

    public float getAgSaturados() {
        return agSaturados;
    }

    public void setAgSaturados(float agSaturados) {
        this.agSaturados = agSaturados;
    }

    public float getSelenio() {
        return selenio;
    }

    public void setSelenio(float selenio) {
        this.selenio = selenio;
    }
}

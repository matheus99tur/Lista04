package br.edu.up.modelos;

public class SeguroVeiculo extends Seguro {
    private String modeloVeiculo;
    private String placaVeiculo;

    public SeguroVeiculo(String numeroApolice, String descricao, double valor, String modeloVeiculo, String placaVeiculo) {
        super(numeroApolice, descricao, valor);
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Modelo Veículo: " + modeloVeiculo + ", Placa Veículo: " + placaVeiculo;
    }
}

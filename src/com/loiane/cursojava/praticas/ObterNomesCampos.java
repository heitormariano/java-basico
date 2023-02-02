package com.loiane.cursojava.praticas;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObterNomesCampos {

  public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException {

    List<EntidadeTeste> entidades = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      EntidadeTeste entidade = new EntidadeTeste();
      entidade.setId(i);
      entidade.setCodRelacionamento(i + 1);
      entidade.setEndereco("endereco " + i);
      entidade.setNome("Nome show " + i);
      entidade.setData(new Date());
      entidades.add(entidade);
    }

    List<List<String>> listaRetornada = listaObjetoParaListaLista(entidades);
    System.out.println(listaRetornada);
    Field[] testeCampos = getCamposExistentes(new EntidadeTeste());
    for (Field campo : testeCampos) {
      System.out.println(" : " + campo.getName());
    }
    
    List<String> valores = new ArrayList<>();
    
    for (EntidadeTeste entidade : entidades) {
      valores.add(entidade.getId().toString());
      valores.add(entidade.getCodRelacionamento().toString());
      valores.add(entidade.getNome());
      valores.add(entidade.getEndereco());
    }
    
    valores.forEach(elem -> System.out.println(elem));
  }

  @SuppressWarnings("unused")
  private static List<List<String>> listaObjetoParaListaLista(List<EntidadeTeste> lista) {
    List<List<String>> ListaRetornar = new ArrayList<>();
    List<String> nomes = new ArrayList<>();
    List<String> campos = new ArrayList<>();

    if (lista != null && lista.size() > 0) {
      Class<?> clazz = lista.get(0).getClass();

      for (Field atributo : clazz.getDeclaredFields()) {
        nomes.add(atributo.getName());
      }
    }
    ListaRetornar.add(nomes);
    return ListaRetornar;
  }

  private static Field[] getCamposExistentes(Object object) {
    return object.getClass().getDeclaredFields();
  }

}

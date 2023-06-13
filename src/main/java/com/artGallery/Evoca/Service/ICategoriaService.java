package com.artGallery.Evoca.Service;

import java.util.List;

import com.artGallery.Evoca.Model.CategoriaModel;

public interface ICategoriaService {

    CategoriaModel insertarCategoria(CategoriaModel categoria);

    List<CategoriaModel> obtenerCategorias();

    CategoriaModel obtenerCategoriaPorId(int id);

    // Otros métodos del servicio según tus necesidades
}

package com.danielfireman.courses.map.wrappers;

import java.io.IOException;

/**
 * Exemplo do padrão decorador. A idéia principal aqui é adicionar funcionalidade a <code>Imagem</code>(através
 * da aplicação do filtro), sem alterar a interface <code>Imagem</code>.
 *
 * <p>Importante notar que optamos por utilizar composição da <code>Imagem</code>, mas o mesmo comportamento
 * poderia ser conseguido através de herança.
 */
class ImagemComFiltro implements Imagem {
    Cabecalho cabecalho;
    Imagem img;
    Path path;

    ImagemComFiltro(Imagem img, Path path, Cabecalho cabecalho) {
        this.img = img;
        this.cabecalho = cabecalho;
        this.path = path;
    }

    @Override
    public void draw() throws IOException {
        byte[][] content = this.img.content();
        // aplica filtro ao conteúdo da imagem.
        System.out.println("Desenha imagem com filtro " + largura() + " x " + altura());
    }

    @Override
    public short altura() {
        return this.cabecalho.altura();
    }

    @Override
    public short largura() {
        return this.cabecalho.largura();
    }

    @Override
    public String getTipo() {
        return this.path.getTipo();
    }

    @Override
    public byte[][] content() throws IOException { return this.img.content(); }
}
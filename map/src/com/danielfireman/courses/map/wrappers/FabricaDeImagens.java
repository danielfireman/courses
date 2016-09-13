package com.danielfireman.courses.map.wrappers;

public class FabricaDeImagens {
    Imagem novaInstancia(String path) {
        final String tipo = new Path(path).getTipo();
        switch (tipo) {
            case "gif":
                // Circa 1997
                //return new Gif(path);
                // Circa 1998
                // return new ImagemProxy(
                //        new Gif(path),
                //        new Path(path),
                //        new CabecalhoGif(path));
                return new GifProxy(new Path(path), new CabecalhoGif(path));
            };
                //return new AdapterGif(new ImprovedGif(path), new Path(path), new CabecalhoGif(path));
        }
        throw new RuntimeException("Booo");
    }
}
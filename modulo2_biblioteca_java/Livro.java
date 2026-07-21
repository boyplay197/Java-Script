public class Livro {
 private String titulo,genero; private Autor autor; private boolean disponivel=true;
 public Livro(String t,String g,Autor a){titulo=t;genero=g;autor=a;}
 public String getTitulo(){return titulo;} public String getGenero(){return genero;}
 public Autor getAutor(){return autor;} public boolean isDisponivel(){return disponivel;}
 public void setDisponivel(boolean d){disponivel=d;}
}
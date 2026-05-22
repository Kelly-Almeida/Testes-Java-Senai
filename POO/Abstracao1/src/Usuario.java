public class Usuario {
     private String nomeUsuario, email;
     public Usuario(String nomeUsuario, String email){
         this.nomeUsuario = nomeUsuario;
         this.email = email;
     }

     public String getNomeDeUsuario(){
         return this.nomeUsuario;
     }

     public String getEmail(){
         return this.email;
     }

}

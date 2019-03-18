package br.com.pfizer.enumerated;

import lombok.Getter;

@Getter
public enum TipoUsuario {

    USUARIO_ENTIDADE(0, "Usuário Entidade"),
    USUARIO_MODERADOR_YABA(1, "Usuário Moderador - Yabá Consultoria"),
    USUARIO_MODERADOR_PFIZER(2, "Usuário Moderador - Pfizer");

    private int id;
    private String descricao;

    TipoUsuario(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
}

package br.com.pfizer.enumerated;

import lombok.Getter;

@Getter
public enum AreaAtuacao {

    REUMATICAS(0, "Doenças Reumáticas"),
    INFLAMATORIAS_INTESTINAIS(1, "Doenças Inflamatórias Intestinais"),
    ONCOLOGIA(2, "Oncologia");

    private int id;
    private String descricao;

    AreaAtuacao(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

}

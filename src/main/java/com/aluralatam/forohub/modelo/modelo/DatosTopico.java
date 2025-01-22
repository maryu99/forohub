package com.aluralatam.forohub.modelo.modelo;

import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

public record DatosTopico(
        @NotBlank (message = "Titulo no puede estar en blanco")
        String titulo,

        @NotBlank (message = "Campo 'mensaje' no puede estar en blanco")
        String mensaje,

        @NotNull
        LocalDateTime fechaCreacion,

        String status,

        String autor,

        String curso

        //List<DatosRespuesta> respuestas
) {
}

package com.aluralatam.forohub.modelo.modelo;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,

        String titulo,

        String mensaje,

        String status
) {
}

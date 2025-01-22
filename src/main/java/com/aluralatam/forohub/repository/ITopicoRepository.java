package com.aluralatam.forohub.repository;

import com.aluralatam.forohub.modelo.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ITopicoRepository {
    Page<Topico> findByActivoTrue(Pageable paginacion);
}

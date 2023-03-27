package br.com.springmsjava.rhworker.repositories;

import br.com.springmsjava.rhworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}

package it.uniroma3.siw.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Credentials;
import it.uniroma3.siw.model.User;

public interface CredentialsRepository extends CrudRepository<Credentials, Long> {

public Optional<Credentials> findByUsername(String username);
	
	public Optional<Credentials> findByUser(User user);

	public boolean existsByUsername(String username);

	public Iterable<Credentials> findByRole(String adminRole);
}

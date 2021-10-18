package io.javaproject.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.javaproject.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
  Team findByTeamName(String teamName);
}

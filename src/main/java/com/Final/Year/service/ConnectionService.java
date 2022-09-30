package com.Final.Year.service;

import com.Final.Year.models.ConnectionModel;
import com.Final.Year.repositories.ConnectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionService {

    private final ConnectionRepository connectionRepository;

    public ConnectionService(ConnectionRepository connectionRepository) {
        this.connectionRepository = connectionRepository;
    }

    public ConnectionModel saveConnection(ConnectionModel connection) {
        return connectionRepository.save(connection);
    }

    public ConnectionModel getConnection(long id) {
        return connectionRepository.findById(id).get();
    }

    public List<ConnectionModel> getAllConnections() {
        return connectionRepository.findAll();
    }

    public ConnectionModel updateConnection(ConnectionModel connection) {
        return connectionRepository.save(connection);
    }

    public void deleteConnectionById(long id) {
        connectionRepository.deleteById(id);
    }

    public void deleteAllConnections() {
        connectionRepository.deleteAll();
    }
}

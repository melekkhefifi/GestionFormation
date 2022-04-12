package com.b2m.sbsresto.services.impl;

import com.b2m.sbsresto.models.Version;
import com.b2m.sbsresto.repository.VersionRepository;
import com.b2m.sbsresto.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class VersionServiceImpl implements VersionService {

    @Autowired
    private VersionRepository versionRepository;

    @Override
    public Version getVersion() {
        return versionRepository.findAll().stream().findFirst().orElse(null);
    }
}
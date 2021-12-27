package com.ssafy.happyhouse.model.mapper;

import java.util.List;

import com.ssafy.happyhouse.model.EnvDto;

public interface EnvMapper {

	List<EnvDto> getEnvs(String address) throws Exception;
}

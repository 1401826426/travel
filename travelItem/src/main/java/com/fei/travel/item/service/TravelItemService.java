package com.fei.travel.item.service;

import com.fei.common.Response;

public interface TravelItemService {

	Response list(int type, int st, int limit);

	Response detail(int id);

}

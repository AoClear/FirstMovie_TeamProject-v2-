package kr.co.fmos.service;

import org.springframework.stereotype.Service;

import kr.co.fmos.repository.UserHavingCouponRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserHavingCouponService {
	private final UserHavingCouponRepository userHavingCouponRepository;

}

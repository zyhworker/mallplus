package com.zscat.mallplus.sms.service.impl;

import com.zscat.mallplus.sms.entity.SmsFlashPromotion;
import com.zscat.mallplus.sms.mapper.SmsFlashPromotionMapper;
import com.zscat.mallplus.sms.service.ISmsFlashPromotionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 限时购表 服务实现类
 * </p>
 *
 * @author zscat
 * @since 2019-04-19
 */
@Service
public class SmsFlashPromotionServiceImpl extends ServiceImpl<SmsFlashPromotionMapper, SmsFlashPromotion> implements ISmsFlashPromotionService {
    @Override
    public int updateStatus(Long id, Integer status) {
        SmsFlashPromotion flashPromotion = new SmsFlashPromotion();
        flashPromotion.setId(id);
        flashPromotion.setStatus(status);
         this.updateById(flashPromotion);
        return 1;
    }
}
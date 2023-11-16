package com.open.harmony.util;

import com.open.harmony.entity.Stream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FakeDataGenerator {
    public static List<Stream> generateFakeStreamData() {
        List<Stream> fakeDataList = new ArrayList<>();

        // 生成假数据
        for (int i = 1; i <= 10; i++) {
            Stream streamData = new Stream();
            streamData.setId(i);
            streamData.setTimestamp(LocalDateTime.now().minusDays(i));
            streamData.setFootfallCount((int) (Math.random() * 1000));
            streamData.setMarketId((int) (Math.random() * 100));
            streamData.setLocation("Location " + i);
            fakeDataList.add(streamData);
        }

        return fakeDataList;
    }
}
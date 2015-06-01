package com.zhanghui.root.statistics.analyzer;

import com.zhanghui.root.statistics.common.ChartPvUvData;

import java.util.List;

public interface Analyzer {
    List<ChartPvUvData> analyze() throws Exception;
}

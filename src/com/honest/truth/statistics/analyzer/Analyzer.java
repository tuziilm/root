package com.honest.truth.statistics.analyzer;

import com.honest.truth.statistics.common.ChartPvUvData;

import java.util.List;

public interface Analyzer {
    List<ChartPvUvData> analyze() throws Exception;
}

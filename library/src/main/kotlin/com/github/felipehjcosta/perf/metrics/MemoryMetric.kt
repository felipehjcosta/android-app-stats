package com.github.felipehjcosta.perf.metrics

data class MemoryMetric(val totalMemoryOfCurrentAppProcess: Long) {

    val totalMemoryOfCurrentAppProcessInMB: Long = this.totalMemoryOfCurrentAppProcess / (1024L * 1024L)

}
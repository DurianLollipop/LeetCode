package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _278_FirstBadVersionTest {

  _278_FirstBadVersion firstBadVersion = new _278_FirstBadVersion();

  @Test
  void firstBadVersion() {
    int result = firstBadVersion.firstBadVersion(1);
    assertEquals(1, result);
  }
}
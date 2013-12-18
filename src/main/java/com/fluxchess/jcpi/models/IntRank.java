/*
 * Copyright 2007-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fluxchess.jcpi.models;

/**
 * This class encodes rank information as an int value. The data is
 * encoded as follows:<br/>
 * <br/>
 * <code>Bit 0 - 3</code>: the rank (required)<br/>
 */
public final class IntRank {

  public static final int MASK = 0xF;

  public static final int NORANK = 5;

  public static final int R1 = 6;
  public static final int R2 = 7;
  public static final int R3 = 8;
  public static final int R4 = 9;
  public static final int R5 = 10;
  public static final int R6 = 11;
  public static final int R7 = 12;
  public static final int R8 = 13;

  public static final int[] values = {
    R1, R2, R3, R4, R5, R6, R7, R8
  };

  private IntRank() {
  }

  public static int valueOf(GenericRank genericRank) {
    if (genericRank == null) throw new IllegalArgumentException();

    switch (genericRank) {
      case R1:
        return R1;
      case R2:
        return R2;
      case R3:
        return R3;
      case R4:
        return R4;
      case R5:
        return R5;
      case R6:
        return R6;
      case R7:
        return R7;
      case R8:
        return R8;
      default:
        throw new IllegalArgumentException();
    }
  }

  public static GenericRank toGenericRank(int rank) {
    switch (rank) {
      case R1:
        return GenericRank.R1;
      case R2:
        return GenericRank.R2;
      case R3:
        return GenericRank.R3;
      case R4:
        return GenericRank.R4;
      case R5:
        return GenericRank.R5;
      case R6:
        return GenericRank.R6;
      case R7:
        return GenericRank.R7;
      case R8:
        return GenericRank.R8;
      default:
        throw new IllegalArgumentException();
    }
  }

  public static int ordinal(int rank) {
    switch (rank) {
      case R1:
        return 0;
      case R2:
        return 1;
      case R3:
        return 2;
      case R4:
        return 3;
      case R5:
        return 4;
      case R6:
        return 5;
      case R7:
        return 6;
      case R8:
        return 7;
      default:
        throw new IllegalArgumentException();
    }
  }

  public static boolean isValid(int rank) {
    switch (rank) {
      case R1:
      case R2:
      case R3:
      case R4:
      case R5:
      case R6:
      case R7:
      case R8:
        return true;
      default:
        return false;
    }
  }

}

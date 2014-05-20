/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.mapred;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

@InterfaceAudience.LimitedPrivate({"MapReduce"})
@InterfaceStability.Unstable
public class IndexRecord {
  public long startOffset;
  public long rawLength;
  public long partLength;
  
  public long mapStartOffset = -1;
  public long mapEndOffset = -1;
  public long mapSpillIndex = -1;
//  public long mapCompressedLength = -1;
	
  public IndexRecord() { }

  public IndexRecord(long startOffset, long rawLength, long partLength,
      long mapStartOffset, long mapEndOffset, long mapSpillIndex) {
    super();
    this.startOffset = startOffset;
    this.rawLength = rawLength;
    this.partLength = partLength;
    this.mapStartOffset = mapStartOffset;
    this.mapEndOffset = mapEndOffset;
    this.mapSpillIndex = mapSpillIndex;
  }
  
  
  
}

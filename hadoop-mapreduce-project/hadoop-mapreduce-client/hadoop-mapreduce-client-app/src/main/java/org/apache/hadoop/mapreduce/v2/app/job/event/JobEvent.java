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

package org.apache.hadoop.mapreduce.v2.app.job.event;

import org.apache.hadoop.yarn.event.AbstractEvent;
import org.apache.hadoop.mapred.MapSpillInfo;
import org.apache.hadoop.mapreduce.TaskAttemptID;
import org.apache.hadoop.mapreduce.v2.api.records.JobId;

/**
 * This class encapsulates job related events.
 *
 */
public class JobEvent extends AbstractEvent<JobEventType> {

  private JobId jobID;
  
  private MapSpillInfo spillInfo;
  private TaskAttemptID mapId;
  private String nodeHttp;

  public MapSpillInfo getSpillInfo() {
    return spillInfo;
  }

  public void setSpillInfo(MapSpillInfo spillInfo) {
    this.spillInfo = spillInfo;
  }

  public JobEvent(JobId jobID, JobEventType type) {
    super(type);
    this.jobID = jobID;
  }

  public JobId getJobId() {
    return jobID;
  }

  public TaskAttemptID getMapId() {
    return mapId;
  }

  public void setMapId(TaskAttemptID mapId) {
    this.mapId = mapId;
  }

  public String getNodeHttp() {
    return nodeHttp;
  }

  public void setNodeHttp(String nodeHttp) {
    this.nodeHttp = nodeHttp;
  }

}

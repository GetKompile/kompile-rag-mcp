/*
 * Copyright 2025 Kompile Inc.
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

import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment'; // If you use environment files

@Injectable({
  providedIn: 'root'
})
export class BaseService {
  // Adjust if your Spring Boot backend runs on a different port or context path
  public readonly backendUrl = environment.apiUrl || 'http://localhost:8080/api';

  constructor() { }
}

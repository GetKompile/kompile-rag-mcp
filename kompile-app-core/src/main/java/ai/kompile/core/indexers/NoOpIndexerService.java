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

package ai.kompile.core.indexers;

import org.springframework.ai.document.Document;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
public class NoOpIndexerService implements IndexerService {
    @Override
    public void indexDocuments(List<Document> documents) throws IOException {

    }

    @Override
    public void reprocessAndIndexAllSources() throws IOException {

    }

    @Override
    public boolean isIndexAvailable() {
        return false;
    }
}

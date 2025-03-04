/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
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

package org.jkiss.dbeaver.model.app;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

/**
 * Desktop eclipse based workspace
 */
public interface DBPWorkspaceEclipse extends DBPWorkspace
{
    @NotNull
    IWorkspace getEclipseWorkspace();

    void setActiveProject(@NotNull DBPProject project);

    @Nullable
    <T extends DBPProject> T getProject(@NotNull IProject project);

    void addProjectListener(@NotNull DBPProjectListener listener);

    void removeProjectListener(@NotNull DBPProjectListener listener);

    void save(DBRProgressMonitor monitor) throws DBException;

}

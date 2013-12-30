package org.jvnet.hudson.plugins.thinbackup.ThinBackupMgmtLink

def f=namespace(lib.FormTagLib)
def l=namespace(lib.LayoutTagLib)
def st=namespace("jelly:stapler")

l.layout(norefresh:true, permission:app.ADMINISTER, title:my.displayName) {
  include(app, "sidepanel.jelly")
  l.main-panel {
    h1 {
      img(src:"${imagesURL}/48x48/"+it.iconFileName)
      text("thinBackup Configuration")
    }
    
    f.form(method:"POST", action:"saveSettings") {
      f.section(title:"Backup Settings") {
        f.entry(title:"Backup directory:", field:"backupPath") {
          f.textbox(value:h.defaulted(instance?.configuration.backupPath))  
        }
      }
    }
  }

 /* <f:form method="post" action="saveSettings">
       <f:section title="Backup settings">
          <f:entry title="Backup directory" field="backupPath"
              help="/plugin/thinBackup/help/help-backupPath.html">
              <f:textbox value="${it.configuration.backupPath}" name="backupPath"
                  checkUrl="'${rootURL}/plugin/thinBackup/checkBackupPath?value='+escape(this.value)"/>
          </f:entry>
          
          <f:entry title="Backup schedule for full backups" field="fullBackupSchedule"
              help="/plugin/thinBackup/help/help-fullBackupSchedule.html">
              <f:textbox value="${it.configuration.fullBackupSchedule}" name="fullBackupSchedule"
                  checkUrl="'${rootURL}/plugin/thinBackup/checkBackupSchedule?value='+escape(this.value)"/>
          </f:entry>
          
          <f:entry title="Backup schedule for differential backups" field="diffBackupSchedule"
              help="/plugin/thinBackup/help/help-diffBackupSchedule.html">
              <f:textbox value="${it.configuration.diffBackupSchedule}" name="diffBackupSchedule"
                  checkUrl="'${rootURL}/plugin/thinBackup/checkBackupSchedule?value='+escape(this.value)"/>
          </f:entry>
          
          <f:entry title="Max number of backup sets" field="nrMaxStoredFull"
              help="/plugin/thinBackup/help/help-nrMaxStoredFull.html">
              <f:textbox value="${it.configuration.nrMaxStoredFull}" name="nrMaxStoredFull" />
          </f:entry>
          
          <f:entry title="Files excluded from backup (regular expression)" field="excludedFilesRegex"
              help="/plugin/thinBackup/help/help-excludedFilesRegex.html">
              <f:textbox value="${it.configuration.excludedFilesRegex}" name="excludedFilesRegex"
                  checkUrl="'${rootURL}/plugin/thinBackup/checkExcludedFilesRegex?value='+escape(this.value)"/>
          </f:entry>
          
          <f:optionalBlock title="Wait until Jenkins/Hudson is idle to perform a backup"
              help="/plugin/thinBackup/help/help-waitForIdle.html"
              checked="${it.configuration.waitForIdle}"
              name="waitForIdle" checkUrl="'${rootURL}/plugin/thinBackup/checkWaitForIdle?value='+escape(this.value)">
              <f:entry title="Force Jenkins to quiet mode after specified minutes" field="forceQuietModeTimeout"
help="/plugin/thinBackup/help/help-forceQuietModeTimeout.html">
<f:textbox value="${it.configuration.forceQuietModeTimeout}" name="forceQuietModeTimeout"
checkUrl="'${rootURL}/plugin/thinBackup/checkForceQuietModeTimeout?value='+escape(this.value)"/>
              </f:entry>
          </f:optionalBlock>

          <f:optionalBlock title="Backup build results"
              help="/plugin/thinBackup/help/help-backupBuildResults.html"
              checked="${it.configuration.backupBuildResults}"
              name="backupBuildResults" >
              <f:optionalBlock title="Backup build archive"
                  help="/plugin/thinBackup/help/help-backupBuildArchive.html"
                  checked="${it.configuration.backupBuildArchive}"
                  name="backupBuildArchive" />
              <f:optionalBlock title="Backup only builds marked to keep"
                  help="/plugin/thinBackup/help/help-backupBuildToKeepOnly.html"
                  checked="${it.configuration.backupBuildsToKeepOnly}"
                  name="backupBuildsToKeepOnly" />
          </f:optionalBlock>
          
          <f:optionalBlock title="Backup 'userContent' folder"
              help="/plugin/thinBackup/help/help-backupUserContent.html"
              checked="${it.configuration.backupUserContents}"
              name="backupUserContents" />

          <f:optionalBlock title="Backup next build number file"
              help="/plugin/thinBackup/help/help-backupNextBuildNumber.html"
              checked="${it.configuration.backupNextBuildNumber}"
              name="backupNextBuildNumber" />

          <f:optionalBlock title="Clean up differential backups"
              help="/plugin/thinBackup/help/help-cleanupDiff.html"
              checked="${it.configuration.cleanupDiff}"
              name="cleanupDiff" />
          
          <f:optionalBlock title="Move old backups to ZIP files"
              help="/plugin/thinBackup/help/help-moveOldBackupsToZipFile.html"
              checked="${it.configuration.moveOldBackupsToZipFile}"
              name="moveOldBackupsToZipFile" />
      </f:section>
      
      <f:section>
         <f:entry>
           <f:submit value="Save"/>
         </f:entry>
      </f:section>
  </f:form>
</l:main-panel>*/
}
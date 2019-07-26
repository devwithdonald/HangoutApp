import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserMessagesTableComponent } from './basic-user-messages-table.component';

describe('BasicUserMessagesTableComponent', () => {
  let component: BasicUserMessagesTableComponent;
  let fixture: ComponentFixture<BasicUserMessagesTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserMessagesTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserMessagesTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
